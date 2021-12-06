package com.example;

public class ItemTypeBo {

	public void add(ItemType object ,ItemType[] itemTypeArray,Integer index) {
		itemTypeArray[index]=object;
		System.out.println("New item is added successfully");
		}
	public void search(String search, ItemType[] itemTypeArray) {
		boolean flag=false;
		for(int i=0;i<itemTypeArray.length;i++) {
			if(itemTypeArray[i].getName().equals(search)) {
				flag=true;
				System.out.println("item found");
				System.out.println(itemTypeArray[i]);
			}
		}
		if(flag==false)
			System.out.println("searched item type not found");
		
		
		}
	public void display(ItemType[] itemTypeArray) {
		for(int i=0;i<itemTypeArray.length;i++) {
			System.out.println("item type number :"+(i+1));
			System.out.println(itemTypeArray[i]);
		}
	}
	

}