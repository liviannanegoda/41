public class Program {
  
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        
        
        JobAgency jobAgency = (JobAgency) publisher;
        
        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student = new Student("Student #1");
        Master master1 = new Master("Master #1");
        Master master2 = new Master("Master #2");
        Middle middle1 = new Middle("Middle #1");

        Vacancy vac1 = new Vacancy("Google", "jun", 35000);
        Vacancy vac2 = new Vacancy("Google", "mid", 35000,"тестировщик");           
        Vacancy vac3 = new Vacancy("Google", "mid", 75000,"инженер-программист");      
        Vacancy vac4 = new Vacancy("geekBrains", "sen", 175000,"архитектор");    
     
        jobAgency.addVacancy(vac1);
        jobAgency.addVacancy(vac2);
        jobAgency.addVacancy(vac3);  
        jobAgency.addVacancy(vac4);           
        jobAgency.listVacancies();
    
        publisher.registerObserver(student);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(middle1);

        publisher.listObserver();
        //publisher.removeObserver(middle1);
        google.needEmployee();
        publisher.listObserver();

        // for (int i = 0; i < 3; i++){
        //     google.needEmployee();
        //     yandex.needEmployee();
        //     geekBrains.needEmployee();
        // }

    }

}
