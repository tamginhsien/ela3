package com.example.ela2.utils

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import java.util.regex.Pattern

object ArduinoSyntaxHighlighter {

    private val KEYWORDS = arrayOf(
        "setup", "loop", "pinMode", "digitalWrite", "digitalRead", "analogRead", "analogWrite",
        "delay", "Serial", "begin", "print", "println", "available", "read",
        "if", "else", "for", "while", "return", "true", "false", "HIGH", "LOW", "INPUT", "OUTPUT", "INPUT_PULLUP"
    )

    private val TYPES = arrayOf(
        "void", "int", "char", "String", "float", "double", "long", "boolean", "bool", "byte"
    )

    private val KEYWORD_COLOR = Color.parseColor("#d35400") // Orange
    private val TYPE_COLOR = Color.parseColor("#2980b9")    // Blue
    private val STRING_COLOR = Color.parseColor("#27ae60")  // Green
    private val COMMENT_COLOR = Color.parseColor("#7f8c8d") // Gray
    private val NUMBER_COLOR = Color.parseColor("#f39c12")  // Yellow/Orange
    private val MACRO_COLOR = Color.parseColor("#8e44ad")   // Purple

    fun highlight(code: String): SpannableString {
        val spannable = SpannableString(code)

        // Highlight Types
        for (type in TYPES) {
            val pattern = Pattern.compile("\\b\\\b")
            val matcher = pattern.matcher(code)
            while (matcher.find()) {
                spannable.setSpan(ForegroundColorSpan(TYPE_COLOR), matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }

        // Highlight Keywords
        for (keyword in KEYWORDS) {
            val pattern = Pattern.compile("\\b\\\b")
            val matcher = pattern.matcher(code)
            while (matcher.find()) {
                spannable.setSpan(ForegroundColorSpan(KEYWORD_COLOR), matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            }
        }

        // Highlight Numbers
        val numberPattern = Pattern.compile("\\b\\d+\\b")
        val numberMatcher = numberPattern.matcher(code)
        while (numberMatcher.find()) {
            spannable.setSpan(ForegroundColorSpan(NUMBER_COLOR), numberMatcher.start(), numberMatcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        
        // Highlight Macros (#include, #define)
        val macroPattern = Pattern.compile("^#.*", Pattern.MULTILINE)
        val macroMatcher = macroPattern.matcher(code)
        while (macroMatcher.find()) {
            spannable.setSpan(ForegroundColorSpan(MACRO_COLOR), macroMatcher.start(), macroMatcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        // Highlight Strings
        val stringPattern = Pattern.compile("\".*?\"")
        val stringMatcher = stringPattern.matcher(code)
        while (stringMatcher.find()) {
            spannable.setSpan(ForegroundColorSpan(STRING_COLOR), stringMatcher.start(), stringMatcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        // Highlight Comments (// and /* */)
        val commentPattern = Pattern.compile("//.*|/\\*(.|[\\r\\n])*?\\*/")
        val commentMatcher = commentPattern.matcher(code)
        while (commentMatcher.find()) {
            spannable.setSpan(ForegroundColorSpan(COMMENT_COLOR), commentMatcher.start(), commentMatcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        return spannable
    }
}
