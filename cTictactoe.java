import java.util.Scanner;
class cTictactoe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		disp(arr);
		int move = 1;
		while(true) {
			System.out.println("Player " + move + " take your move");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(arr[((x - 1) * 3 + y) - 1] != 0 || x - 1 > 2 || y - 1 > 2) {
				System.out.println("Can't move here");
				continue;
			}
			else {
				arr[((x - 1) * 3 + y) - 1] = move;
			}
			boolean state = check(arr, move);
			if(state == true)
				break;
			else
				disp(arr);
			if(move == 1)
				move = 2;
			else
				move = 1;
		}
	}
	public static void disp(int[] arr) {
		for(int x = 0; x < 3; x++) {
			System.out.println("-------------");
			for(int y = 0; y < 3; y++) {
				if(arr[(x * 3 + y)] == 0)
					System.out.print("| " + " " + " ");
				else if(arr[(x * 3 + y)] == 1)
					System.out.print("| " + "X" + " ");
				else
					System.out.print("| " + "O" + " ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
	}

	public static boolean check(int[] arr, int a){
		if(arr[0] == a && arr[1] == a && arr[2] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[3] == a && arr[4] == a && arr[5] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
		}
		if(arr[6] == a && arr[7] == a && arr[8] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[0] == a && arr[3] == a && arr[6] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[1] == a && arr[4] == a && arr[7] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[2] == a && arr[5] == a && arr[8] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[0] == a && arr[4] == a && arr[8] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[2] == a && arr[4] == a && arr[6] == a){
			disp(arr);
			System.out.print("player " + a + " wins");
			return true;
		}
		if(arr[0] != 0 && arr[1] != 0 && arr[2] != 0 && arr[3] != 0 
			&& arr[4] != 0 && arr[5] != 0 && arr[6] != 0 && arr[7] != 0 && arr[8] != 0){
			disp(arr);
			System.out.print("Khichdi");
			return true;
		}
		return false;
	}
}