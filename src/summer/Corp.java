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
			return "开发部正在工作。";
		}
	class SaleDep{
			public String work(){
				return "销售部正在工作。";
			}
		}
	}

}
