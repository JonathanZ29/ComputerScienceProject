package myclassproject.mystorygraph;

import java.util.List;

import com.storygraph.*;

import myclassproject.questexample.NodeLabels;

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method adds Camelot actions that execute in order when visiting that node. 
	 * These methods must have a BuilderMethod annotation.
	 */
	@BuilderMethod
	public void rootActions() {
		//Example:
		//var root = get(NodeLabels.root.toString());
		//root.add(new CreateAll(List.of(cottage, town, sword)));
		//int test = 0;
		var root = get(NodeLabels.root.toString());
		root.add(new CreateAll(List.of("tavern", "dungeon", "camp", "hallway", "blue potion", "green potion", "chicken leg", "red potion", "jewel key")));
		root.add(new CreateCharacterSequence(List.of("peasant", "knight", "warlock")));
		
		root.add(new SetPosition("peasant", "camp"));
		root.add(new SetPosition("knight", "hallway"));
		root.add(new SetPosition("chicken leg", "hallway"));
		root.add(new SetPosition("sword", "hallway"));
		root.add(new SetPosition("blue potion", "tavern"));
		root.add(new SetPosition("green potion", "tavern"));
		root.add(new SetPosition("red potion", "tavern"));
		root.add(new SetPosition("jewel key", "tavern"));
		root.add(new SetPosition("warlock", "dungeon"));
		
		root.add(new SetCameraFocus("peasant"));
		
		root.add(new ShowMenu());
	}
}
