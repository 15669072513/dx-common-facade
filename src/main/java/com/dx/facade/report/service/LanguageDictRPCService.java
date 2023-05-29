package com.dx.facade.report.service;

import java.util.Map;

import com.dx.facade.enums.BwLanguageEnum;
import com.dx.facade.report.constant.LanguageDictConfig;

/**
 * 多语言字典
 */
public interface LanguageDictRPCService {
    Map<String, String> getSingleDict(BwLanguageEnum languageEnum, LanguageDictConfig.DictKeyEnum languageDictKeyEnum);

    Map<LanguageDictConfig.DictKeyEnum,Map<String, String>> getAllDict(BwLanguageEnum languageEnum);
}
