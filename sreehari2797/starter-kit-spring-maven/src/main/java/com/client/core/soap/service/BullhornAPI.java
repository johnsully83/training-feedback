package com.client.core.soap.service;

import java.util.List;

import com.bullhorn.apiservice.ApiService;
import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiQueryResult;
import com.bullhorn.apiservice.result.ApiSaveResult;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.user.UserTypeDto;
import com.client.core.ApplicationSettings;

/**
 * Main bullhorn api utility class. Handles session creation.
 * 
 * @author magnus.palm
 * 
 */
public interface BullhornAPI {

    /**
     * Finds an entity of type entityType with the passed in id
     * 
     * @param entityType
     * @param id
     * @return
     */
    public <T extends AbstractDto> T findEntity(String entityType, Object id);

    /**
     * Deletes an entity
     * 
     * @param entity
     */
    public <T extends AbstractDto> void delete(T entity);

    /**
     * Finds the user type of a Corporate User using the id of the user type
     * 
     * @param id
     *            the id of the user type
     * 
     * @return a UserTypeDto or null if no user type found
     */
    public UserTypeDto findUserType(int id);

    /**
     * Takes a dto query and an entity type and returns the result in List<T extends AbstractDto>
     * 
     * @param entityType
     *            the bullhorn entity type, see ApiEntityName
     * @param dtoQuery
     *            a query
     * 
     * @return A list of DTOs of type entityType based on the dtoQuery.
     */

    public <T extends AbstractDto> List<T> getQueryResults(String entityType, DtoQuery dtoQuery);
    
    /**
     * Returns a List<T> containing a type of AbstractDto
     * 
     * @param entityType
     *            the entity type to return
     * @param ids
     *            the list of entity ids
     * @return
     */
    public <T extends AbstractDto> List<T> getDtosFromIds(String entityType, List<Object> ids);

    public ApiQueryResult query(DtoQuery query);

    /**
     * Persist an entity to Bullhorn
     * 
     * @param entity
     *            the entity to persist
     * 
     * @return ApiSaveResult
     */
    public ApiSaveResult save(AbstractDto entity);

    /**
     * Persist a list of AbstractDtos to Bullhorn
     * 
     * @param dtoList
     *            the entities to persist
     * 
     */
    public <T extends AbstractDto> void saveDtos(List<T> dtoList);

    public ApiService getService();

    public String getSession();

    public void setSession(String session);

    public int getCorporationID();

    public ApplicationSettings getAppSettings();

    public String getHostName();
    
    public String assembleOpenWindowLink(String hostName, ApiEntityName entity, Integer id);
    /**
     * Returns a full open window link to the ApiEntityName with the passed in id.
     * 
     * @param entity
     * @param id
     * @return
     */
    public String assembleOpenWindowLink(ApiEntityName entity, Integer id);

}
