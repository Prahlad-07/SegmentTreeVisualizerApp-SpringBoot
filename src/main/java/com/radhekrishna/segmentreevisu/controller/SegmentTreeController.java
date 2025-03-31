package com.radhekrishna.segmentreevisu.controller;

import com.radhekrishna.segmentreevisu.service.SegmentTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/segment-tree")
public class SegmentTreeController {

    @Autowired
    private SegmentTreeService segmentTreeService;

    @PostMapping("/create")
    public String createTree(@RequestBody int[] arr) {
        segmentTreeService.createTree(arr);
        return "Segment Tree Created!";
    }

    @GetMapping("/query")
    public int query(@RequestParam int left, @RequestParam int right) {
        return segmentTreeService.query(left, right);
    }

    @PostMapping("/update")
    public String update(@RequestParam int index, @RequestParam int value) {
        segmentTreeService.update(index, value);
        return "Segment Tree Updated!";
    }

    @GetMapping("/tree")
    public int[] getTree() {
        return segmentTreeService.getTree();
    }
}
