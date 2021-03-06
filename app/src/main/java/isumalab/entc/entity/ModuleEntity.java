package isumalab.entc.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class ModuleEntity {

    @NonNull
    public int getCredit() {
        return credit;
    }

    public void setCredit(@NonNull int credit) {
        this.credit = credit;
    }

    @NonNull
    public boolean isActive() {
        return active;
    }

    public void setActive(@NonNull boolean active) {
        this.active = active;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    @NonNull
    public int getSemester_no() {
        return semester_no;
    }

    public void setSemester_no(@NonNull int semester_no) {
        this.semester_no = semester_no;
    }

    @NonNull
    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(@NonNull String module_name) {
        this.module_name = module_name;
    }

    @NonNull
    public String getModule_code() {
        return module_code;
    }

    public void setModule_code(@NonNull String module_code) {
        this.module_code = module_code;
    }

    @NonNull
    public boolean isGpa() {
        return gpa;
    }

    public void setGpa(@NonNull boolean gpa) {
        this.gpa = gpa;
    }


    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private int semester_no;

    @NonNull
    private String module_name;

    @NonNull
    private String module_code;

    @NonNull
    private boolean gpa;

    @NonNull
    private int credit;

    @NonNull
    private boolean active;

    private int score;

}
