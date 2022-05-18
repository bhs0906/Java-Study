package Salary_Management;

public class CompanyBasics 
{
    private String name, rank; // 이름, 직급
    private int normal, extrapay; // 기본급, 수당
    private double tariff, salary; // 세율, 월급
    
    public String getName() {    // 이름 받아오기
        return name;
    }
    public void setName(String name) {    // 이름 지정하기
        this.name = name;
    }
    public String getRank() {    // 직급 받아오기
        return rank;
    }
    public void setRank(String rank) {    // 직급 지정하기
        this.rank = rank;
    }
    public int getNormal() {    // 기본급 받아오기
        return normal;
    }
    public void setNormal(int normal) {    // 기본급 지정하기
        this.normal = normal;
    }
    public int getExtrapay() {    // 수당 받아오기
        return extrapay;
    }
    public void setExtrapay(int extrapay) {    // 수당 지정하기
        this.extrapay = extrapay;
    }
    public double getTariff() {    // 세율 받아오기
        return tariff;
    }
    public void setTariff(double tariff) {    // 세율 지정하기
        this.tariff = tariff;
    }
    public double getSalary() {    // 월급 받아오기
        return salary;
    }
    public void setSalary(double salary) {    // 월급 지정하기
        this.salary = salary;
    }
    
    
    // toString을 오버라이드 해주지 않으면
    // 저장된 객체의 주소가 출력된다.
    @Override
    public String toString() 
    {
        return "이름 : " + this.getName() +
                ", 직급 : " + this.getRank() +
                ", 기본급 : " + this.getNormal() + "만원" +
                ", 수당 : " + this.getExtrapay() + "만원" +
                ", 세율 : " + (int)(this.getTariff()*100) + "%" +
                ", 월급 : " + this.getSalary() +"만원"; 
    }
}