package com.example.Todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Todo {
	@Id // Entityの主キーを設定
	@GeneratedValue // Entityの値を自動採番
	private Long id;
	private String content;

}
