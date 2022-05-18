package Salary_Management;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class CompanyService implements Company
{
    // Scanner기능을 사용하기 위해 객체 생성
    Scanner sc = new Scanner(System.in);
 
    // CompanyBasics 클래스를 사용하기 위해 객체 생성
    CompanyBasics cb = new CompanyBasics();
 
    // CompanyBasics객체만 담을 수 있는 ArrayList 생성
    ArrayList<CompanyBasics> csarr = new ArrayList<CompanyBasics>();
 
    // 직원 한명의 값 전달 메서드
    @Override
    public void saveWorker()
    {
        // savaWorker메서드 안에서 새로 생성해주지 않으면 ArrayList에 넣어줄때
        // 모든값이 마지막에 입력한 값으로 일괄변경 되기 때문에 생성해준다.
        CompanyBasics cb = new CompanyBasics();
 
        // 입력받는 타입이 다르면 예외처리를 해주기위해 try-catch문 사용
        try 
        {
            System.out.print("등록할 직원의 이름을 입력하세요 : ");
            // Scanner로 입력받은 값을 setName메서드를 이용해서 넣어주기
            String name = sc.next();
            cb.setName(name);
            System.out.print("등록할 직원의 직급을 입력하세요 : ");
            // Scanner로 입력받은 값을 setRank메서드를 이용해서 넣어주기
            String rank = sc.next();
            cb.setRank(rank);
 
        }
        catch (InputMismatchException e) 
        {
            System.out.println("문자를 입력하세요.");
            // 잘못입력된 값 비워주기
            sc.nextLine();
        }
 
        try 
        {
            System.out.print("등록할 직원의 기본급을 입력하세요(만원) : ");
            // Scanner로 입력받은 값을 setNormal메서드를 이용해서 넣어주기
            int normal = sc.nextInt();
            cb.setNormal(normal);
            System.out.print("등록할 직원의 수당을 입력하세요(만원) : ");
            // Scanner로 입력받은 값을 setExtrapay메서드를 이용해서 넣어주기
            int extrapay = sc.nextInt();
            cb.setExtrapay(extrapay);
 
            // Scanner로 입력받은 Normal, Extrapay값을 이용해서 Tariff값 넣어주기
            if ((cb.getNormal() + cb.getExtrapay()) <= 200) 
            {
                cb.setTariff(0.01);
            }
            else if ((cb.getNormal() + cb.getExtrapay()) <= 400) 
            {
                cb.setTariff(0.02);
            } 
            else if ((cb.getNormal() + cb.getExtrapay()) > 400)
            {
                cb.setTariff(0.03);
            }
 
            // Normal, Extrapay, Tariff값을 이용해서 Salary값 넣어주기
            cb.setSalary(
                    (cb.getNormal() + cb.getExtrapay()) - (((cb.getNormal() + cb.getExtrapay()) * cb.getTariff())));
 
            // 설정한 값들이 저장된 CompanyBasics객체를 ArrayList에 저장
            csarr.add(cb);
        }
        catch (InputMismatchException e)
        {
            sc.nextLine();
            System.out.println("숫자를 입력하세요.");
        }
 
    }
 
    // 특정 직원의 직급, 기본급, 수당 수정 메서드
    @Override
    public void modify() 
    {
        try
        {
            if (csarr.size() == 0)
            {
                throw new IndexOutOfBoundsException("저장되있는 직원 정보가 없습니다.");
            }
            // 모든 직원들의 정보를 보여주기 위해 outpub메서드 호출
            outpub();
 
            try 
            {
                System.out.print("수정할 직원의 입사번호를 입력하세요 : ");
                // 수정할 직원의 입사번째 번호를 입력
                int i = sc.nextInt();
 
                // ArrayList는 0번째 방부터 저장되기 때문에 입력한 값에서 1을 빼서 저장
                i = i - 1;
 
                // 입력한 입사자의 정보를 ArrayList에서 삭제
                csarr.remove(i);
 
                System.out.print("수정할 직원의 이름을 입력하세요 :");
                // Scanner로 입력받은 값을 setName메서드를 이용해서 넣어주기
                cb.setName(sc.next());
                System.out.print("직원의 직급을 수정하세요 : ");
                // Scanner로 입력받은 값을 setRank메서드를 이용해서 넣어주기
                cb.setRank(sc.next());
                System.out.print("직원의 기본급을 수정하세요 : ");
                // Scanner로 입력받은 값을 setNormal메서드를 이용해서 넣어주기
                cb.setNormal(sc.nextInt());
                System.out.print("직원의 수당을 수정하세요 : ");
                // Scanner로 입력받은 값을 setExtrapay메서드를 이용해서 넣어주기
                cb.setExtrapay(sc.nextInt());
 
                if ((cb.getNormal() + cb.getExtrapay()) <= 200) 
                {
                    cb.setTariff(0.01);
                } 
                else if ((cb.getNormal() + cb.getExtrapay()) <= 400)
                {
                    cb.setTariff(0.02);
                } 
                else if ((cb.getNormal() + cb.getExtrapay()) > 400) 
                {
                    cb.setTariff(0.03);
                }
 
                // Normal, Extrapay, Tariff값을 이용해서 Salary값 넣어주기
                cb.setSalary(
                        (cb.getNormal() + cb.getExtrapay()) - (((cb.getNormal() + cb.getExtrapay()) * cb.getTariff())));
 
                // 새로 입력받은 직원의 정보를 삭제한 자리에 저장
                csarr.add(i, cb);
            } 
            catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("숫자를 입력하세요.");
            }
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
 
    // 이름 값으로 해당 값을 가진 직원 찾기 & 해당 값 출력 메서드
    @Override
    public void search() 
    {
        try 
        {
            if (csarr.size() == 0)
            {
                throw new IndexOutOfBoundsException("저장되있는 직원 정보가 없습니다.");
            }
 
            try
            {
                System.out.print("찾으려는 직원의 이름을 입력하세요 : ");
                // 찾으려는 직원의 이름을 입력받고 name2에 저장
                String name2 = sc.next();
 
                for (int i = 0; i < csarr.size(); i++) 
                {
                    // ArrayList에 저장되있는 값들의 Name을 불러오기
                    cb = csarr.get(i);
                    cb.getName();
 
                    // ArrayList의 Name과 입력한 Name2가 같으면
                    // 그 Name의 정보를 모두 출력
                    if (name2.equals(cb.getName())) 
                    {
                        outputTitle();
                        System.out.println(csarr.get(i));
                    }
                }
            } 
            catch (InputMismatchException e) 
            {
                sc.nextLine();
                System.out.println("문자를 입력하세요.");
            }
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
 
    }
 
    // 출력되는 정보들의 타이틀 출력 메서드
    @Override
    public void outputTitle() 
    {
        System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
    }
 
    // 모든 직원의 정보 출력 메서드
    @Override
    public void outpub() 
    {
        int cnt = 1;
        try
        {
            if (csarr.size() == 0) 
            {
                throw new IndexOutOfBoundsException("저장되있는 직원 정보가 없습니다.");
            }
            for (int i = 0; i < csarr.size(); i++) 
            {
 
                System.out.print(cnt + "번째 입사자 ");
 
                // ArrayList에 저장된 모든 객체 출력해서 보여주기
                System.out.println(csarr.get(i));
                cnt = cnt + 1;
            }
        } 
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}