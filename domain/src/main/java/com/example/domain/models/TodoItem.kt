package com.example.domain.models

data class TodoItem (
    var id: String? = null,
    var itemName: String? = null,
    var isComplete: Boolean? = false
)