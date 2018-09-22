package com.example;

import java.util.ArrayList;
import java.util.List;

public class MerkleTest {
	public static void main(String[] args) {
		List<String> tempTxList = new ArrayList<String>();
		tempTxList.add("My");
		tempTxList.add("name");
		tempTxList.add("is");
		tempTxList.add("Nikhil");
		tempTxList.add("Goyal");

		MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
		merkleTrees.merkle_tree();
		System.out.println("root : " + merkleTrees.getRoot());
	}
}