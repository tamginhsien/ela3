package com.example.ela2.data

import android.content.Context
import android.content.SharedPreferences

object FavoritesManager {
    private const val PREFS_NAME = "ela_favorites"
    private const val KEY_FAVORITES = "favorite_ids"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun getFavorites(context: Context): Set<String> {
        return getPrefs(context).getStringSet(KEY_FAVORITES, setOf()) ?: setOf()
    }

    fun isFavorite(context: Context, exampleId: String): Boolean {
        return getFavorites(context).contains(exampleId)
    }

    fun toggleFavorite(context: Context, exampleId: String): Boolean {
        val prefs = getPrefs(context)
        val favorites = getFavorites(context).toMutableSet()
        val isNowFavorite = if (favorites.contains(exampleId)) {
            favorites.remove(exampleId)
            false
        } else {
            favorites.add(exampleId)
            true
        }
        prefs.edit().putStringSet(KEY_FAVORITES, favorites).apply()
        return isNowFavorite
    }
}
