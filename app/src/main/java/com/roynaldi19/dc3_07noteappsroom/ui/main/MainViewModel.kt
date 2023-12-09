package com.roynaldi19.dc3_07noteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.roynaldi19.dc3_07noteappsroom.database.Note
import com.roynaldi19.dc3_07noteappsroom.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val noteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = noteRepository.getAllNotes()
}