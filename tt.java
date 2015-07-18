public tt(){
	public static void fibo(int n) {
		int a0=0;	//첫번째 숫자
		int a1=1;	//두번째 숫자
		int a2=0;	//세번째 숫자
		
		if(n==0){
			System.out.print("0");
		}else{
			System.out.print(a0+" "+a1+" "); //첫번째와 두번째 숫자 출력
			
			for(int i=0; i<=n; i++) {
				a2=a0+a1;	//세번째 숫자는 이전 2개 숫자 합한 값
				System.out.print(a2+" ");
				a0=a1;
				a1=a2;
			}
		}
	}
}
