package com.David.view;

import com.David.dao.CourseDaoImpl;
import com.David.dao.CurriculumDaoImpl;
import com.David.entity.Course;
import com.David.entity.Curriculum;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private JPanel main;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtCredits;
    private JCheckBox yesCheckBox;
    private JComboBox comboCurriculum;
    private JButton addCuriculumnButton;
    private JComboBox comboSemester;
    private JButton saveButton;
    private JButton resetButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JTable tableCourse;
    private JPanel tabel;
    private JPanel isi;
    private CurriculumDaoImpl curriculumDao;
    private CourseDaoImpl courseDao;
    private List<Curriculum> curricula ;
    private List<Course> courses ;
    private DefaultComboBoxModel<Curriculum> curriculumComboBoxModel;
    private CourseTableModel courseTableModel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private  void  clearAndReset(){
        txtId.setText("");
        txtName.setText("");
        txtCredits.setText("");
        txtId.setEnabled(true);
        saveButton.setEnabled(true);
        updateButton.setEnabled(false);
        tableCourse.clearSelection();

    }

    public Main() {
        curriculumDao = new CurriculumDaoImpl();
        courseDao = new CourseDaoImpl();
        curricula = new ArrayList<>();
        courses = new ArrayList<>();
        try {
            curricula.addAll(curriculumDao.fetchAll());
            courses.addAll((courseDao.fetchAll()));
        } catch (SQLException | ClassCastException throwables) {
            throwables.printStackTrace();
        }
        curriculumComboBoxModel = new  DefaultComboBoxModel<>(curricula.toArray(new Curriculum[0]));
        comboCurriculum.setModel(curriculumComboBoxModel);
        courseTableModel= new CourseTableModel((courses));
        tableCourse.setModel(courseTableModel);
        tableCourse.setAutoCreateRowSorter(true);

    }

    private static class  CourseTableModel extends AbstractTableModel {
        private List<Course> courses;
        private final  String[] COLUMNS = {"ID", "NAME", "CREDITS", "LAB_SESSION", "SEMESTER", "CURRICULUMN_ID"};

        private CourseTableModel(List<Course> courses){
            this.courses = courses;
        }

        @Override
        public int getRowCount() {
            return courses.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return switch (columnIndex){
                case 0 -> courses.get(rowIndex).getId();
                case 1 -> courses.get(rowIndex).getName();
                case 2 -> courses.get(rowIndex).getCredits();
                case 3 -> courses.get(rowIndex).isLabSession();
                case 4 -> courses.get(rowIndex).getSemester();
                case 5 -> courses.get(rowIndex).getCurriculum();
                default -> "";
            };
        }

        @Override
        public String getColumnName(int column) {
            return  COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0,columnIndex)!=null){
                return getValueAt(0,columnIndex).getClass();
            }
            return Object.class;
        }


    }
}

