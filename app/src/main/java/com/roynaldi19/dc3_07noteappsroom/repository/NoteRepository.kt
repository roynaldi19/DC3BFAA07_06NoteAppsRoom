package com.roynaldi19.dc3_07noteappsroom.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.roynaldi19.dc3_07noteappsroom.database.Note
import com.roynaldi19.dc3_07noteappsroom.database.NoteDao
import com.roynaldi19.dc3_07noteappsroom.database.NoteRoomDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class NoteRepository(application: Application) {
    private val noteDao: NoteDao
    private val executorService: ExecutorService = Executors.newSingleThreadExecutor()

    init {
        val db = NoteRoomDatabase.getDatabase(application)
        noteDao = db.noteDao()
    }

    fun getAllNotes(): LiveData<List<Note>> = noteDao.getAllNotes()

    fun insert(note: Note) {
        executorService.execute {
            noteDao.insert(note)
        }
    }

    fun delete(note: Note) {
        executorService.execute {
            noteDao.delete(note)
        }
    }

    fun update(note: Note) {
        executorService.execute {
            noteDao.update(note)
        }
    }
}