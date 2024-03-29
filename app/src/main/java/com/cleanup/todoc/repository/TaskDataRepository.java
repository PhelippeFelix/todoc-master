package com.cleanup.todoc.repository;
import android.arch.lifecycle.LiveData;
import com.cleanup.todoc.database.dao.TaskDao;
import com.cleanup.todoc.model.Task;
import java.util.List;

/**
 * Created by Skiti on 24/10/2019
 */

public class TaskDataRepository {
    private final TaskDao mTaskDao;
    public TaskDataRepository(TaskDao taskDao) { this.mTaskDao = taskDao; }

    // --- GET ---
    public LiveData<Task> getTask(long taskId){ return this.mTaskDao.getTask(taskId); }
    public LiveData<List<Task>> getAllTasks(){return this.mTaskDao.getAllTasks();}
    public LiveData<Integer>getTaskCount() {return this.mTaskDao.getTaskCount();}
    // --- CREATE ---
    public void createTask(Task task){ mTaskDao.insertTask(task); }
    // --- DELETE ---
    public void deleteTask(long taskId){ mTaskDao.deleteTask(taskId); }
    // --- UPDATE ---
    public void updateTask(Task task){ mTaskDao.updateTask(task); }
}
