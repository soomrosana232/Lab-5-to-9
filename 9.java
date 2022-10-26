class lab_task_9{
	public static void main(String[] args){
		int x=0,y=1,z;		
		System.out.print(x+" "+y);		
		for(int i = 2; i<20;++i)
		{
			z = x + y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
	}
}