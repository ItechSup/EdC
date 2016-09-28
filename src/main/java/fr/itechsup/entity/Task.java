package fr.itechsup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private int id;

	@Column(name = "name")
	private String taskName;

	@Column(name = "description")
	private String taskDescription;

	@Column(name = "priority")
	private String taskPriority;

	@Column(name = "status")
	private String taskStatus;

	@Column(name = "archived")
	private int taskArchived = 0;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	@Column(name = "createdDate")
	private String taskCreatedDate = dateFormat.format(new Date());
	
	@Column(name = "archivedDate")
	private String taskArchivedDate = dateFormat.format(new Date());;

	public int getTaskId() {
		return id;
	}

	public void setTaskId(int taskId) {
		this.id = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int isTaskArchived() {
		return taskArchived;
	}

	public void setTaskArchived(int taskArchived) {
		this.taskArchived = taskArchived;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", taskDescription=" + taskDescription + ", taskPriority="
				+ taskPriority + ",taskStatus=" + taskStatus + "]";
	}

}
