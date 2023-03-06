package com.endava.internship.collections;

import java.util.*;

public class StudentSet implements Set<Student> {
    private Set<Student> studentSet;
    public StudentSet() {
        studentSet = new HashSet<>();
    }
    @Override
    public int size() {
        return studentSet.size();
    }

    @Override
    public boolean isEmpty() {
        return studentSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Student) {
            for (Student student : studentSet) {
                if (student.getName().equals(((Student) o).getName()) &&
                        student.getDateOfBirth().equals(((Student) o).getDateOfBirth())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<Student> iterator() {
        return studentSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return studentSet.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        int i = 0;
        for (Student student : studentSet) {
            ts[i] = (T) student;
            i++;
        }
        return ts;
    }

    @Override
    public boolean add(Student student) {
        if (!contains(student)) {
            studentSet.add(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return studentSet.remove(o);
    }

    @Override
    public void clear() {
        studentSet.clear();
    }

    @Override
    public boolean addAll(Collection<? extends Student> collection) {
        for (Student student : collection) {
            if (!contains(student)) {
                studentSet.add(student);
            } else {
                return false;
            }
        }
        return true;
    }

    public List<Student> sort() {
        List<Student> students = new ArrayList<>(studentSet);
        Collections.sort(students);
        return students;
    }


    @Override
    public boolean containsAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }
}
