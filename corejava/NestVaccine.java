import java.util.Scanner;
class NestVaccine{
	public static void main(String args[]){
		Scanner scan = new  Scanner(System.in);
		int age;
		System.out.println("enter the age:");
		age= scan.nextInt();
		if(age>=18){
			if(age>=18 && age<=40){
				System.out.println("Covaxin");
				}
			else if(age>=40 && age<=60){
				System.out.println("Covishield");
				}
			else{
				System.out.println("Sputnik");
				}
		}else{
			System.out.println("no vaccine");
			}
	}
}	