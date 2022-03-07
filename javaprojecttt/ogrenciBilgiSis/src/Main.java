public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut","5468","TRH");
        Teacher t2 = new Teacher("Ayşe","0068","FZK");
        Teacher t3 = new Teacher("külyutmaz","00682","MAT");
        System.out.println("*******BOOOOOŞŞŞLLUUUUKKK*******");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        tarih.addTeacher(t2);
        Course fizik = new Course("fizik","102","FZK");
        Course matematik = new Course("matematik","103","MAT");
        System.out.println("*******BOOOOOŞŞŞLLUUUUKKK*******");

        Student s1 = new Student("inek şaban","123", "4",tarih,fizik,matematik);
        s1.addBulkExamNote(100,200,50);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("güdük","2135","2",tarih,fizik,matematik);
        s1.addBulkExamNote(10,20,100);
        s1.printNote();
        s1.isPass();


    }
}
