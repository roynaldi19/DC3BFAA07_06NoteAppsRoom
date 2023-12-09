package com.roynaldi19.dc3_07noteappsroom.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.roynaldi19.dc3_07noteappsroom.database.Note
import com.roynaldi19.dc3_07noteappsroom.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val noteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        noteRepository.insert(note)
    }

    fun update(note: Note) {
        noteRepository.update(note)
    }

    fun delete(note: Note){
        noteRepository.delete(note)
    }
}
