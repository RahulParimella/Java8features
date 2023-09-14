package Comparabale;

class MobileComparable implements Comparable<MobileComparable> {
		private String mobileName;
		private double price;
		public String getMobileName() {
			return mobileName;
		}
		public void setMobileName(String mobileName) {
			this.mobileName = mobileName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public MobileComparable(String mobileName, double price) {
			super();
			this.mobileName = mobileName;
			this.price = price;
		}
		@Override
		public String toString() {
			return "price =" + price ;
		}
		@Override
		public int compareTo(MobileComparable o) {
			// TODO Auto-generated method stub
			return (int) (this.getPrice() - o.getPrice());
		}
		
	
}
