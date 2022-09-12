package com.muhammaddevin.android.mynoteapp.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.muhammaddevin.android.mynoteapp.database.Note
import com.muhammaddevin.android.mynoteapp.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}