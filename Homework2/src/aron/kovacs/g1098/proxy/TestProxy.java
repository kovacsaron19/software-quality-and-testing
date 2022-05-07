package aron.kovacs.g1098.proxy;

public class TestProxy {

	public static void main(String[] args) {
		LoginInterface loginInterface = new StandardLogin("localhost:5000/test");
		
		loginInterface.login("JohnDoe1", "./dir/JD1.flac");
		
		loginInterface = new FlaggedLoginProxy(loginInterface);
		
		loginInterface.login("JohnDoe2", ".dir/JD2.flac");

	}

}
