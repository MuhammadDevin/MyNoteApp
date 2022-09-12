package com.muhammaddevin.android.mynoteapp.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.muhammaddevin.android.mynoteapp.database.Note
import com.muhammaddevin.android.mynoteapp.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }

    fun delete(note: Note){
        mNoteRepository.update(note)
    }
}