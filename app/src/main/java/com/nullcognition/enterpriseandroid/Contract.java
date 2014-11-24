package com.nullcognition.enterpriseandroid;
/**
 * Created by ersin on 22/11/14 at 11:57 PM
 */
public class Contract {}
// marshalling creatin the transeferable representation form a resource to fit the json schema
/*
 * Example contract json to be handeled by gson
 * {
 "title": "RESTfulContacts",
 "type": "object",
 "properties": {
 "id": {
 "type": "integer"
 },
 "firstName": {
 "description": "first name",
 "type": "string"
 },
 "lastName": {
 "description": "last name",
 "type": "string"
 }Basic REST
 ❘ 121
 "phone": {
 "description": "phone number",
 "type": "string"
 }
 "email": {
 "description": "email address",
 "type": "string"
 }
 "version": {
 "description": "version id",
 "type": "integer",
 "minimum": 0
 }
 "updateTime": {
 "description": "time of last sync",
 "type": "integer",
 "minimum": 0
 }
 "deleted": {
 "description": "contact has been deleted",
 "type": "boolean",
 }
 }
 }
 *
 */
