package com.arc.jScraperService.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageData {
    private String thumbnailUrl;
    private String imagePageURL;
    private String imageUrl;
    private String cachedImageURL;
}
