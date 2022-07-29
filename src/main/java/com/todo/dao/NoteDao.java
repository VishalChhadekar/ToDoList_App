package com.todo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.todo.entity.Note;

@Repository
public class NoteDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void saveNote(Note note) {
		this.hibernateTemplate.save(note);
	}

	public List<Note> getAllNotes() {
		List<Note> allNotes = this.hibernateTemplate.loadAll(Note.class);
		return allNotes;

	}
}
