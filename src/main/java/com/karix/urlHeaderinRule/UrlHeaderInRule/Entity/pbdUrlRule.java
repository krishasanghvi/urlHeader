//package com.karix.urlHeaderinRule.UrlHeaderInRule.Entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class pbdUrlRule {
//        @Id
//        public String esmeAddr;
//
//        @Override
//        public String toString()
//        {
//            return "PDBURLRuleBean [esmeAddr=" + esmeAddr
//                    + ", urlRuleId="
//                    + urlRuleId
//                    + ", ruleId="
//                    + ruleId
//                    + ", url="
//                    + url
//                    + ", secureSocket="
//                    + secureSocket
//                    + ", certificateType="
//                    + certificateType
//                    + ", certificateAuthority="
//                    + certificateAuthority
//                    + ", certificateVerified="
//                    + certificateVerified
//                    + ", certificateFilePath="
//                    + certificateFilePath
//                    + ", certificateUploaded="
//                    + certificateUploaded
//                    + ", urlMethod="
//                    + urlMethod
//                    + ", urlTest="
//                    + urlTest
//                    + ", secondaryURL="
//                    + secondaryURL
//                    + ", message="
//                    + message
//                    + ", autoResponse="
//                    + autoResponse
//                    + ", autoResponseMessage="
//                    + autoResponseMessage
//                    + ", autoResponseErrorMessage="
//                    + autoResponseErrorMessage
//                    + ", autoResponseErrorMessageEcho="
//                    + autoResponseErrorMessageEcho
//                    + ", mapType="
//                    + mapType
//                    + ", certificatePath="
//                    + certificatePath
//                    + ", userName="
//                    + userName
//                    + ", password="
//                    + password
//                    + ", lblUser="
//                    + lblUser
//                    + ", lblPassword="
//                    + lblPassword
//                    + ", lblMID="
//                    + lblMID
//                    + ", lblDest="
//                    + lblDest
//                    + ", lblSend="
//                    + lblSend
//                    + ", lblStatus="
//                    + lblStatus
//                    + ", lblReason="
//                    + lblReason
//                    + ", lblType="
//                    + lblType
//                    + ", lblSTime="
//                    + lblSTime
//                    + ", lblDTime="
//                    + lblDTime
//                    + ", lblOperator="
//                    + lblOperator
//                    + ", lblCircle="
//                    + lblCircle
//                    + ", lblCustMID="
//                    + lblCustMID
//                    + ", lblFileID="
//                    + lblFileID
//                    + ", lblPlatform="
//                    + lblPlatform
//                    + ", lblSplitMsgParts="
//                    + lblSplitMsgParts
//                    + ", lblSplitMsgPartNo="
//                    + lblSplitMsgPartNo
//                    + ", lblStatusFlag="
//                    + lblStatusFlag
//                    + ", lblSTS="
//                    + lblSTS
//                    + ", lblAID="
//                    + lblAID
//                    + ", lblPID="
//                    + lblPID
//                    + ", lblACode="
//                    + lblACode
//                    + ", lblPCode="
//                    + lblPCode
//                    + ", lblMsg="
//                    + lblMsg
//                    + ", noOfRetries="
//                    + noOfRetries
//                    + ", timestampFormat="
//                    + timestampFormat
//                    + ", lblMiddlewareStatus="
//                    + lblMiddlewareStatus
//                    + ", apiHeader="
//                    + apiHeader
//                    + ", apiMessage="
//                    + apiMessage
//                    + ", apiCType="
//                    + apiCType
//                    + ", batchSize="
//                    + batchSize
//                    + ", responseHeader="
//                    + responseHeader
//                    + ", responseTemplate="
//                    + responseTemplate
//                    + ", responseFooter="
//                    + responseFooter
//                    + ", responseBatchDelimiter="
//                    + responseBatchDelimiter
//                    + ", parameterName="
//                    + parameterName
//                    + ", httpConnectionTimeoutInMills="
//                    + httpConnectionTimeoutInMills
//                    + "]";
//        }
//
//        public long   urlRuleId;
//        public long   ruleId;
//        public String url;
//        public int    secureSocket;
//        public int    certificateType;
//        public String certificateAuthority;
//        public int    certificateVerified;
//        public String certificateFilePath;
//        public int    certificateUploaded;
//        public String urlMethod;
//        public int    urlTest;
//        public String secondaryURL;
//        public String message;
//        public String autoResponse;
//        public String autoResponseMessage;
//        public int    autoResponseErrorMessage;
//        public int    autoResponseErrorMessageEcho;
//        public int    mapType;
//        public String certificatePath;
//        public String userName;
//        public String password;
//        public String lblUser;
//        public String lblPassword;
//        public String lblMID;
//        public String lblDest;
//        public String lblSend;
//        public String lblStatus;
//        public String lblReason;
//        public String lblType;
//        public String lblSTime;
//        public String lblDTime;
//        public String lblOperator;
//        public String lblCircle;
//        public String lblCustMID;
//        public String lblFileID;
//        public String lblPlatform;
//        public String lblSplitMsgParts;
//        public String lblSplitMsgPartNo;
//        public String lblStatusFlag;
//        public String lblSTS;
//        public String lblAID;
//        public String lblPID;
//        public String lblACode;
//        public String lblPCode;
//        public String lblMsg;
//        public int    noOfRetries;
//        public String timestampFormat;
//        public String lblMiddlewareStatus;
//        public String apiHeader;
//        public String apiMessage;
//        public String apiCType;
//
//        public int    batchSize;
//        public String responseHeader;
//        public String responseTemplate;
//        public String responseFooter;
//        public String responseBatchDelimiter;
//        public String parameterName;
//        public String httpConnectionTimeoutInMills;
//
//        public String getParameterName()
//        {
//            return parameterName;
//        }
//
//        public String getHttpConnectionTimeoutInMills()
//        {
//            return httpConnectionTimeoutInMills;
//        }
//
//        public String getResponseBatchDelimiter()
//        {
//            return responseBatchDelimiter;
//        }
//
//        public void setResponseBatchDelimiter(String aResponseBatchDelimiter)
//        {
//            responseBatchDelimiter = aResponseBatchDelimiter;
//        }
//
//        public int getBatchSize()
//        {
//            return batchSize;
//        }
//
//        public void setBatchSize(int aBatchSize)
//        {
//            batchSize = aBatchSize;
//        }
//
//        public String getResponseHeader()
//        {
//            return responseHeader;
//        }
//
//        public void setResponseHeader(String aBodyHeader)
//        {
//            responseHeader = aBodyHeader;
//        }
//
//        public String getResponseTemplate()
//        {
//            return responseTemplate;
//        }
//
//        public void setResponseTemplate(String aBodyTemplate)
//        {
//            responseTemplate = aBodyTemplate;
//        }
//
//        public String getResponseFooter()
//        {
//            return responseFooter;
//        }
//
//        public void setResponseFooter(String aBodyFooter)
//        {
//            responseFooter = aBodyFooter;
//        }
//
//        public String getEsmeAddress()
//        {
//            return esmeAddr;
//        }
//
//        public long getUrlRuleId()
//        {
//            return urlRuleId;
//        }
//
//        public long getRuleId()
//        {
//            return ruleId;
//        }
//
//        public String getUrl()
//        {
//            return url;
//        }
//
//        public int getSecureSocket()
//        {
//            return secureSocket;
//        }
//
//        public int getCertificateType()
//        {
//            return certificateType;
//        }
//
//        public String getCertificateAuthority()
//        {
//            return certificateAuthority;
//        }
//
//        public int getCertificateVerified()
//        {
//            return certificateVerified;
//        }
//
//        public String getCertificateFilePath()
//        {
//            return certificateFilePath;
//        }
//
//        public int getCertificateUploaded()
//        {
//            return certificateUploaded;
//        }
//
//        public String getUrlMethod()
//        {
//            return urlMethod;
//        }
//
//        public int getUrlTest()
//        {
//            return urlTest;
//        }
//
//        public String getSecondaryURL()
//        {
//            return secondaryURL;
//        }
//
//        public String getMessage()
//        {
//            return message;
//        }
//
//        public String getAutoResponse()
//        {
//            return autoResponse;
//        }
//
//        public String getAutoResponseMessage()
//        {
//            return autoResponseMessage;
//        }
//
//        public int getAutoResponseErrorMessage()
//        {
//            return autoResponseErrorMessage;
//        }
//
//        public int getAutoResponseErrorMessageEcho()
//        {
//            return autoResponseErrorMessageEcho;
//        }
//
//        public int getMapType()
//        {
//            return mapType;
//        }
//
//        public String getCertificatePath()
//        {
//            return certificatePath;
//        }
//
//        public String getUserName()
//        {
//            return userName;
//        }
//
//        public String getPassword()
//        {
//            return password;
//        }
//
//        public String getLblUser()
//        {
//            return lblUser;
//        }
//
//        public String getLblPassword()
//        {
//            return lblPassword;
//        }
//
//        public String getLblMID()
//        {
//            return lblMID;
//        }
//
//        public String getLblDest()
//        {
//            return lblDest;
//        }
//
//        public String getLblSend()
//        {
//            return lblSend;
//        }
//
//        public String getLblStatus()
//        {
//            return lblStatus;
//        }
//
//        public String getLblReason()
//        {
//            return lblReason;
//        }
//
//        public String getLblType()
//        {
//            return lblType;
//        }
//
//        public String getLblSTime()
//        {
//            return lblSTime;
//        }
//
//        public String getLblDTime()
//        {
//            return lblDTime;
//        }
//
//        public String getLblOperator()
//        {
//            return lblOperator;
//        }
//
//        public String getLblCircle()
//        {
//            return lblCircle;
//        }
//
//        public String getLblCustMID()
//        {
//            return lblCustMID;
//        }
//
//        public String getLblFileID()
//        {
//            return lblFileID;
//        }
//
//        public String getLblPlatform()
//        {
//            return lblPlatform;
//        }
//
//        public String getLblSplitMsgParts()
//        {
//            return lblSplitMsgParts;
//        }
//
//        public String getLblSplitMsgPartNo()
//        {
//            return lblSplitMsgPartNo;
//        }
//
//        public String getLblStatusFlag()
//        {
//            return lblStatusFlag;
//        }
//
//        public String getLblSTS()
//        {
//            return lblSTS;
//        }
//
//        public String getLblAID()
//        {
//            return lblAID;
//        }
//
//        public String getLblPID()
//        {
//            return lblPID;
//        }
//
//        public String getLblACode()
//        {
//            return lblACode;
//        }
//
//        public String getLblPCode()
//        {
//            return lblPCode;
//        }
//
//        public String getLblMsg()
//        {
//            return lblMsg;
//        }
//
//        public int getNoOfRetries()
//        {
//            return noOfRetries;
//        }
//
//        public String getTimestampFormat()
//        {
//            return timestampFormat;
//        }
//
//        public String getLblMiddlewareStatus()
//        {
//            return lblMiddlewareStatus;
//        }
//
//        public String getAPIHeader()
//        {
//            return apiHeader;
//        }
//
//        public String getAPIMessage()
//        {
//            return apiMessage;
//        }
//
//        public String getAPICType()
//        {
//            return apiCType;
//        }
//    }
