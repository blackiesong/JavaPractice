package summer;

import java.awt.image.CropImageFilter;

import summer.Corp.DevDep.SaleDep;



public class Corp {
	public static void main(String[] args){
		Corp dd=new Corp();
		System.out.println(dd.develop());
	}
	private DevDep d=new DevDep();
	//private SaleDep s=new SaleDep();
	
	public String develop(){
		return d.work();
	}
	//public String sale(){
	//	return new sale;
//	}
	 class DevDep{
		public String work(){
			return "���������ڹ�����";
		}
	class SaleDep{
			public String work(){
				return "���۲����ڹ�����";
			}
		}
	}

}
