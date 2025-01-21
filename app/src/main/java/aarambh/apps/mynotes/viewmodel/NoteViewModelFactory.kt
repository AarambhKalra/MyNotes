package aarambh.apps.mynotes.viewmodel

import aarambh.apps.mynotes.repository.NoteRepository
import android.app.Application
import androidx.lifecycle.ViewModelProvider

class NoteViewModelFactory(val app: Application,private val noteRepository: NoteRepository): ViewModelProvider.Factory {

    override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository) as T

    }
}