package com.todo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.dao.NoteDao;
import com.todo.entity.Note;

@Service
public class NoteService {
	public NoteDao getNoteDao() {
		return noteDao;
	}

	public void setNoteDao(NoteDao noteDao) {
		this.noteDao = noteDao;
	}

	@Autowired
	private NoteDao noteDao;

	@Transactional
	public void saveNote(Note note) {
		noteDao.saveNote(note);
	}

	public List<Note> getNotes() {
		List<Note> allNotes = noteDao.getAllNotes();
		return allNotes;
	}

}
