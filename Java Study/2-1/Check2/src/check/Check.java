package check;
import constants.Constants;


public class Check {
	 private  String firstName;
	 private  String lastName ;

	 private void printName() {
		 this.firstName = "jamie";
		 this.lastName = "sugiyama";

		 System.out.println("printメソッド" + "→" + this.firstName + this.lastName);
	 }

	public static void main(String[] args) {
		Check c = new Check();
		c.printName();

		Pet p = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		p.introduce();

		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		rp.introduce();







		}


		}






