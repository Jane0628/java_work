package oop.poly.player;

public class Warrior extends Player {

	int rage;

	Warrior(String name) {
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player target) {
		
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들입니다.
		 
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고,
		   마법사라면 20의 피해를 받고,
		   사냥꾼이라면 15의 피해를 받습니다.
		   
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해주세요.
		 
		 - 남은 체력도 출력해주세요.
		 
		 - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해주세요.
		 */
		
		if(this.name.equals(target.name)) {
			System.out.println("스스로를 때릴 수는 없습니다.");
			return;
		}
		
		System.out.printf("'%s'(이)가 '%s'(을)를 향해 돌진합니다!\n", this.name, target.name);
		
		if(target instanceof Warrior) {
			System.out.printf("'%s'의 hp : %d -> %d", target.name, target.hp, target.hp - 10);
		} else if(target instanceof Mage) {
			System.out.printf("'%s'의 hp : %d -> %d", target.name, target.hp, target.hp - 20);	
		} else if(target instanceof Hunter){
			System.out.printf("'%s'의 hp : %d -> %d", target.name, target.hp, target.hp - 15);	
		} else {
			System.out.printf("돌진할 상대가 없습니다.");
			return;
		}
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " + rage);
	}	
	
	
}
