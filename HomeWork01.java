
// �ٸ���
//		�ٸ���
//		ch09.Point3D@782830e
//		ch09.Point3D@470e2030
	//-----------------------------------
	// ��ü��. 
//		1. 2���� �޼ҵ� OverRide
//		2. ��ü��ȸ�� --> {x=1, y=2, z=3}
//		 			   {x=1, y=2, z=5}
//		3.��ü �񱳽�     x,y ���� �� ���� 

	class Point3D {
		int x,y,z;
		public Point3D(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj) {
//				return true;
//			}
//			if (!(obj instanceof Point3D)) {
//				return false;
//			}
//			Point3D other = (Point3D) obj;
//			return x == other.x && y == other.y;
//		}
		
		public void numPrint(int n) {
			System.out.println();
		}
	}


	public class HomeWork01 {

		public static void main(String[] args) {
			Point3D pd1 = new Point3D (1, 2, 3);
			Point3D pd2 = new Point3D (1, 2, 4);
			Point3D pd3 = new Point3D (1, 2, 5);
			
			if(pd1.equals(pd2)) System.out.println ("����");
			else  				System.out.println ("�ٸ���");
			if(pd1.equals(pd3))	System.out.println ("����");
			else 				System.out.println ("�ٸ���");
			
//			System.out.println (pd1.x); 
//			System.out.println (pd3);
			
			System.out.println("[x=" + pd1.x + " ,y=" + pd1.y + " ,z="+ pd1.z + "]");
			System.out.println("[x=" + pd2.x + " ,y=" + pd2.y + " ,z="+ pd2.z + "]");
		}
	}
