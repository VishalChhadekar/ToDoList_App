package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.Service.NoteService;
import com.todo.entity.Note;

@Controller
public class ControllerClass {

	@Autowired
	private NoteService noteService;

	public NoteService getNoteService() {
		return noteService;
	}

	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/addnote")
	public String addNote(@ModelAttribute Note note, Model model) {
		noteService.saveNote(note);
		// prefix: redirecting request
		return "redirect:/shownote";
	}

	@RequestMapping("/shownote")
	public String getAllNotes(Model model) {
		List<Note> allNotes = noteService.getNotes();
		model.addAttribute("allnotes", allNotes);
		return "view_all_notes";
	}

}
