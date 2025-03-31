package com.radhekrishna.segmentreevisu.service;

import com.radhekrishna.segmentreevisu.model.SegmentTree;
import org.springframework.stereotype.Service;

@Service
public class SegmentTreeService {
    private SegmentTree segmentTree;

    public void createTree(int[] arr) {
        segmentTree = new SegmentTree(arr);
    }

    public int query(int left, int right) {
        return segmentTree.query(left, right);
    }

    public void update(int index, int value) {
        segmentTree.update(index, value);
    }

    public int[] getTree() {
        return segmentTree.getTree();
    }
}
