package homework17;
//자동차 클래스(총 주행 거리 추가)
	class ExCar extends Car {
		private double totalMileage;


		public ExCar(String name, int width, int height, int length, double fuel, 
				Day purchaseDay) {
			super(name, width, height, length, fuel, purchaseDay);
			this.totalMileage = 0.0;
		}

		// 총 주행거리 확인
		public double getTotalMileage() {
			return totalMileage;
		}
		
		// 사양 표시
		public void putSpec() {
			super.putSpec();
			System.out.printf("총 주행 거리 : %.2fkm\n", totalMileage);
		}
		
		// X방향으로 dx, Y방향으로 dy이동
		public boolean move(double dx, double dy) {
			double dist = Math.sqrt(dx * dx + dy * dy);
			
			if(!super.move(dx, dy))
				return false;
			else {
				totalMileage += dist;
				return true;
		}
	}
}
