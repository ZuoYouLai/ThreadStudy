package modelPattern.single;

public class ThreeSingle {
	
	private static ThreeSingle instance;
	private ThreeSingle(){}
	
	//加锁操作
	/**
	 *线程在if( null == instance)与instance = new ThreeSingle()执行顺序出现的问题
	 *1.直接在方法进行加上 synchronized【效率问题有待考证】
	 *	public static synchronized ThreeSingle doInstance()
	 *
	 *2.进行代码块的进行加锁操作,导致线程是不安全的：仅对实例化加锁操作 :假如线程B先执行，线程B获得锁，线程B执行完之后，线程A获得锁，但是此时没有检查singleton是否为空就直接执行了，所以还会出现两个singleton实例的情况。于是双重检查模式（DCL）就出现了
	 */
	public static ThreeSingle doInstance(){
		if( null == instance){
			synchronized (ThreeSingle.class) {
				instance = new ThreeSingle();
			}
		}
		return instance;
	}
	

}
