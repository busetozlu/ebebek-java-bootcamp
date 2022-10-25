public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonusAmount;
    double addBonus;
    double workTime;
    double salaryIncrease;
    double totalSalary;

    Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        print();
    }
    double tax(){
        if(this.salary<1000){
            taxAmount=0;
            return 0;
        }else {
            taxAmount=(this.salary*0.03);
            salary-=taxAmount;
            return taxAmount;
        }
    }
    double bonus(){
        if(this.workHours>40){
            bonusAmount=this.workHours-40.0;
            addBonus=bonusAmount*30.0;
            salary+=addBonus;
            return addBonus;
        }else {
            return 0;
        }
    }
    double raiseSalary(){
        workTime=2021-this.hireYear;
        if (workTime<10){
            salaryIncrease=salary*0.05;
            totalSalary=salary+salaryIncrease;
            return salaryIncrease;
        } else if (workTime>9 && workTime<20) {
            salaryIncrease=salary*0.10;
            totalSalary=salary+salaryIncrease;
            return salaryIncrease;
        }else if (workTime>19) {
            salaryIncrease=salary*0.15;
            totalSalary=salary+salaryIncrease;
            return salaryIncrease;
        } else {
            return 0;
        }

    }

    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+this.salary);
        System.out.println("Toplam Maaş : "+this.totalSalary);
    }

}
