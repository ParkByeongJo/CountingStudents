import java.util.Scanner;

public class CountingStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//�Է¹ޱ� ���� ���� ����
		int low_age;//���� ���� ����
		int high_age;//���� ���� ����
		int n;//�л� ���� ��Ÿ���� ����
		int age;//�Է��� ���̸� ��Ÿ���� ����
		int k;//�ݺ����� ���� ����
		System.out.print("���� ���� �Է�:");
		low_age=input.nextInt();//�Է¹ޱ� ���� ����
		System.out.print("���� ���� �Է�:");
		high_age=input.nextInt();//�Է¹ޱ� ���� ����
		System.out.print("�л� �� �Է�:");
		n=input.nextInt();//�Է¹ޱ� ���� ����
		int[] students=new int[n];//ũ�Ⱑ n�� �迭 ����
		int[] numOfStudents=new int[high_age-low_age+1];//Ư�� ���̿� �ش��ϴ� �л����� ���� ��Ÿ���� ���� �迭

		for(k=0;k<n;k++) {//�ݺ���
			System.out.print("���� �Է�:");
			age=input.nextInt();//�Է¹ޱ� ���� ����

			if(age>=low_age && age<=high_age) {//�Է��� ���̰� ���� ���ѿ��� ���� ���� ������ ��
				students[k]=age;//�迭�� �Է��� ������ �л��� ����
				numOfStudents[age-low_age]++;//Ư�� ���� �л����� �� ����
			}

			else if(age<low_age || age>high_age) {//�Է��� ���̰� ���� ���ѿ��� ���� ���� ���̰� �ƴ� ��
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���.");
				age=input.nextInt();
				continue;//�ݺ��� ����
			}
		}

		for(k=low_age;k<=high_age;k++) {//���� ���ѿ��� ���� ���ѱ��� �ݺ��� ����
			System.out.println("����:"+k+"�л� ��:"+numOfStudents[k-low_age]);//���� �� �л��� ���
		}

	}

}
