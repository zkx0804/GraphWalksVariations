package edu.unh.cs980.variations;

import java.util.ArrayList;

public class PageNode {
	private String nodeId;
	private float nodeScore;
	private ArrayList<Integer> linkedNodes;
	private float prevScore;

	public PageNode() {

	}

	public PageNode(String nodeId) {
		this.setNodeId(nodeId);
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public float getNodeScore() {
		return nodeScore;
	}

	public void setNodeScore(float nodeScore) {
		this.nodeScore = nodeScore;
	}

	public ArrayList<Integer> getLinkedNodes() {
		return linkedNodes;
	}

	public void setLinkedNodes(ArrayList<Integer> linkedNodes) {
		this.linkedNodes = linkedNodes;
	}

	public float getPrevScore() {
		return prevScore;
	}

	public void setPrevScore(float prevScore) {
		this.prevScore = prevScore;
	}

	@Override
	public String toString() {
		return nodeId + " ===> " + linkedNodes.toString() + "   Node Score: " + nodeScore + "   Previous Node Score: "
				+ prevScore;
	}
}
