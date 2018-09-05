import java.util.Scanner;

public class CountingStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//입력받기 위한 변수 생성
		int low_age;//나이 하한 변수
		int high_age;//나이 상한 변수
		int n;//학생 수를 나타내는 변수
		int age;//입력할 나이를 나타내는 변수
		int k;//반복문을 위한 변수
		System.out.print("나이 하한 입력:");
		low_age=input.nextInt();//입력받기 위한 과정
		System.out.print("나이 상한 입력:");
		high_age=input.nextInt();//입력받기 위한 과정
		System.out.print("학생 수 입력:");
		n=input.nextInt();//입력받기 위한 과정
		int[] students=new int[n];//크기가 n인 배열 생성
		int[] numOfStudents=new int[high_age-low_age+1];//특정 나이에 해당하는 학생들의 수를 나타내기 위한 배열

		for(k=0;k<n;k++) {//반복문
			System.out.print("나이 입력:");
			age=input.nextInt();//입력받기 위한 과정

			if(age>=low_age && age<=high_age) {//입력한 나이가 나이 하한에서 나이 상한 사이일 때
				students[k]=age;//배열에 입력한 나이의 학생을 저장
				numOfStudents[age-low_age]++;//특정 나이 학생들의 수 증가
			}

			else if(age<low_age || age>high_age) {//입력한 나이가 나이 하한에서 나이 상한 사이가 아닐 때
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				age=input.nextInt();
				continue;//반복문 지속
			}
		}

		for(k=low_age;k<=high_age;k++) {//나이 하한에서 나이 상한까지 반복문 돌림
			System.out.println("나이:"+k+"학생 수:"+numOfStudents[k-low_age]);//나이 및 학생수 출력
		}

	}

}
