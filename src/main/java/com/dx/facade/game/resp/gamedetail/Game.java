package com.dx.facade.game.resp.gamedetail;

import lombok.Data;

import java.util.List;

@Data
public class Game {

    private String strGameId;
    private Integer gameStatus;
    private String iconUrl;
    private String gameName;
    private String twGameName;
    private String enGameName;
    private String thGameName;
    private String krGameName;
    private String jpGameName;
    private String viGameName;
    private String myGameName;
    private String idGameName;
    private String enMyGame;
    private String gameTypeID;
    private String typeDescription;
    private String technology;
    private String technologyID;
    private String platform;
    private Boolean demoGameAvailable;
    private String aspectRatio;
    private Long gameIDNumeric;
    private Boolean frbAvailable;
    private Boolean variableFrbAvailable;
    private Integer lines;
    private String dataType;
    private List<String> jurisdictions;
    private Integer gType;
    private Integer mType;
    private Boolean isNew;
    private String rollerSpec;
    private String lineType;
    private String lineNumber;
}
