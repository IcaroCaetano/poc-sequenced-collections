package com.project.poc_sequenced_collections;

import com.project.poc_sequenced_collections.types.ListExample;
import com.project.poc_sequenced_collections.types.MapExample;
import com.project.poc_sequenced_collections.types.ReversedExample;
import com.project.poc_sequenced_collections.types.SetExample;


public class PocSequencedCollectionsApplication {

	public static void main(String[] args) {

		ListExample.execute();
		System.out.println();
		SetExample.execute();
		System.out.println();
		MapExample.execute();
		System.out.println();
		ReversedExample.execute();

	}

}
