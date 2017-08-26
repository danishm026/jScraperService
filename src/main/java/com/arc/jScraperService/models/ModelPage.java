package com.arc.jScraperService.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelPage {
    private String modelPageURL;
    private int pageNumber;
    private int startingImageNumber;
    private int lastImageNumber;
    private List<ImageData> imageDataList;
}