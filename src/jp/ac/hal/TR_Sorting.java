package jp.ac.hal;

class Sort{
	public static void main(String[] args) {
		//データ格納
		int a[] = {210, 19, 72, 129, 34};
		int b = a.length;
		int i, j, k;

		//データ表示
		System.out.println(" データの表示 ");
		for(i = 0; i < b; i++)
			System.out.print(a[i] + " ");
			System.out.println();

		//並び変え文
		for(j = 0; j < b-1; j++) {
			for(i = j+1; i < b; i++) {
				if(a[j] > a[i]) {
					k = a[j];
					a[j] = a[i];
					a[i] = k;
				}
			}
		}

		System.out.println(" 並び変え ");
		for(i = 0; i < b; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}