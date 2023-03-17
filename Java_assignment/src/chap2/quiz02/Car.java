package chap2.quiz02;

public class Car {

	private String model;	// 차 모델명
	private int speed;		// 현재 속도
	private char mode;		// 변속 모드 (P, R, N, D)
	private boolean start;	// 시동 온/오프 상태 여부

	Car() {}

	Car(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed >= 200) return;
		else if(!start) return;
		else if(mode == 'P' || mode == 'N') return;
		else if(mode == 'R' && speed > 40) return;
	}

	public void setMode(char mode) {
		if(mode != 'P' && mode != 'R' && mode != 'N' && mode != 'D') this.mode = 'P';
		else this.mode = mode;
	}

	public char getMode() {
		return mode;
	}

	void engineStart() {
		System.out.println("시동 버튼을 눌렀습니다.");
		injectOil();
		injectGasoline();
		start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}

	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}

	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}

	private void moveCylinder() {
		if(start) System.out.println("실린더가 움직입니다.");
		else System.out.println("실린더가 움직이지 않습니다.");
	}

	void engineStop() {
		if(speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else if(speed == 0 && mode != 'P') {
			System.out.println("P 모드로 먼저 변속기를 변경하세요.");
			return;
		} else {
			start = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

}
