package za.gov.dpw.worxtracksolution.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.gov.dpw.worxtracksolution.entity.*;
import za.gov.dpw.worxtracksolution.service.*;

import java.util.List;

@RestController
@RequestMapping("/implementation")
@CrossOrigin
public class ImplementationMilestoneController {


    @Autowired
    private AwardedProjectValueService awardedProjectValueService;

    @PostMapping({"/addAwardedProjectValue"})
    public AwardedProjectValue addAwardedProjectValue(@RequestBody AwardedProjectValue awardedProjectValue) {

        return awardedProjectValueService.saveAwardedProjectValue(awardedProjectValue);
    }

    @GetMapping("/awardedProjectValue/{ptsRef}")
    public ResponseEntity<List<AwardedProjectValue>> getAllAwardedProjectValueByPtsRef(@PathVariable String ptsRef) {
        List<AwardedProjectValue> awardedProjectValues = awardedProjectValueService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(awardedProjectValues);
    }

    @Autowired
    private ExpenditureService expenditureService;

    @PostMapping({"/addExpenditure"})
    public Expenditure addExpenditure(@RequestBody Expenditure expenditure) {

        return expenditureService.saveExpenditure(expenditure);
    }

    @GetMapping("/expenditure/{ptsRef}")
    public ResponseEntity<List<Expenditure>> getAllExpenditureByPtsRef(@PathVariable String ptsRef) {
        List<Expenditure> expenditures = expenditureService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(expenditures);
    }

    @Autowired
    private AppointedServiceProviderService appointedServiceProviderService;

    @PostMapping({"/addAppointedServiceProvider"})
    public AppointedServiceProvider addServiceProvider(@RequestBody AppointedServiceProvider appointedServiceProvider) {

        return appointedServiceProviderService.saveServiceProvider(appointedServiceProvider);
    }

    @GetMapping("/appointedServiceProvider/{ptsRef}")
    public ResponseEntity<List<AppointedServiceProvider>> getAllByPtsRef(@PathVariable String ptsRef) {
        List<AppointedServiceProvider> serviceProviders = appointedServiceProviderService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(serviceProviders);
    }

    @GetMapping("/{ptsRef}/status-not-null")
    public ResponseEntity<List<AppointedServiceProvider>> getAllByPtsRefAndStatusNotNull(@PathVariable String ptsRef) {
        List<AppointedServiceProvider> serviceProviders = appointedServiceProviderService.getAllByPtsRefAndStatusNotNull(ptsRef);
        return ResponseEntity.ok(serviceProviders);
    }

    @Autowired
    private KickOffMeetingService kickOffMeetingService;

    @PostMapping({"/addKickOffMeeting"})
    public KickOffMeeting saveKickOffMeeting(@RequestBody KickOffMeeting kickOffMeeting) {

        return kickOffMeetingService.saveKickOffMeeting(kickOffMeeting);
    }

    @GetMapping("/kickOffMeeting/{ptsRef}")
    public ResponseEntity<List<KickOffMeeting>> getAllKickOffMeetingByPtsRef(@PathVariable String ptsRef) {
        List<KickOffMeeting> kickOffMeetings = kickOffMeetingService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(kickOffMeetings);
    }

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping({"/addPurchaseOrder"})
    public PurchaseOrder savePurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {

        return purchaseOrderService.savePurchaseOrder(purchaseOrder);
    }

    @GetMapping("/purchaseOrders/{ptsRef}")
    public ResponseEntity<List<PurchaseOrder>> getAllPurchaseOrderByPtsRef(@PathVariable String ptsRef) {
        List<PurchaseOrder> purchaseOrders = purchaseOrderService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(purchaseOrders);
    }

    @Autowired
    private ProjectCharterService projectCharterService;

    @PostMapping({"/addProjectCharter"})
    public ProjectCharter saveProjectCharter(@RequestBody ProjectCharter projectCharter) {

        return projectCharterService.saveProjectCharter(projectCharter);
    }

    @GetMapping("/projectCharters/{ptsRef}")
    public ResponseEntity<List<ProjectCharter>> getAllProjectCharterByPtsRef(@PathVariable String ptsRef) {
        List<ProjectCharter> projectCharters = projectCharterService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(projectCharters);
    }

    @Autowired
    private ServiceLevelAgreementService serviceLevelAgreementService;

    @PostMapping({"/addServiceLevelAgreement"})
    public ServiceLevelAgreement saveServiceLevelAgreement(@RequestBody ServiceLevelAgreement serviceLevelAgreement) {

        return serviceLevelAgreementService.saveServiceLevelAgreement(serviceLevelAgreement);
    }

    @GetMapping("/serviceLevelAgreements/{ptsRef}")
    public ResponseEntity<List<ServiceLevelAgreement>> getAllServiceLevelAgreementByPtsRef(@PathVariable String ptsRef) {
        List<ServiceLevelAgreement> serviceLevelAgreements = serviceLevelAgreementService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(serviceLevelAgreements);
    }

    @Autowired
    private InformationGatheringService informationGatheringService;

    @PostMapping({"/addInformationGathering"})
    public InformationGathering saveInformationGathering(@RequestBody InformationGathering informationGathering) {

        return informationGatheringService.saveInformationGathering(informationGathering);
    }

    @GetMapping("/informationGatherings/{ptsRef}")
    public ResponseEntity<List<InformationGathering>> getAllInformationGatheringByPtsRef(@PathVariable String ptsRef) {
        List<InformationGathering> informationGatherings = informationGatheringService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(informationGatherings);
    }

    @Autowired
    private ArchitecturalDesignService architecturalDesignService;

    @PostMapping({"/addArchitecturalDesign"})
    public ArchitecturalDesign saveArchitecturalDesign(@RequestBody ArchitecturalDesign architecturalDesign) {

        return architecturalDesignService.saveArchitecturalDesign(architecturalDesign);
    }

    @GetMapping("/architecturalDesigns/{ptsRef}")
    public ResponseEntity<List<ArchitecturalDesign>> getAllArchitecturalDesignByPtsRef(@PathVariable String ptsRef) {
        List<ArchitecturalDesign> architecturalDesigns = architecturalDesignService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(architecturalDesigns);
    }

    @Autowired
    private SoftwareDeliveredService softwareDeliveredService;

    @PostMapping({"/addSoftwareDelivered"})
    public SoftwareDelivered saveSoftwareDelivered(@RequestBody SoftwareDelivered softwareDelivered) {

        return softwareDeliveredService.saveSoftwareDelivered(softwareDelivered);
    }

    @GetMapping("/softwareDeliveries/{ptsRef}")
    public ResponseEntity<List<SoftwareDelivered>> getAllSoftwareDeliveredByPtsRef(@PathVariable String ptsRef) {
        List<SoftwareDelivered> softwareDeliveries = softwareDeliveredService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(softwareDeliveries);
    }

    @Autowired
    private HardwareDeliveredService hardwareDeliveredService;

    @PostMapping({"/addHardwareDelivered"})
    public HardwareDelivered saveHardwareDelivered(@RequestBody HardwareDelivered hardwareDelivered) {

        return hardwareDeliveredService.saveHardwareDelivered(hardwareDelivered);
    }

    @GetMapping("/hardwareDeliveries/{ptsRef}")
    public ResponseEntity<List<HardwareDelivered>> getAllHardwareDeliveredByPtsRef(@PathVariable String ptsRef) {
        List<HardwareDelivered> hardwareDeliveries = hardwareDeliveredService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(hardwareDeliveries);
    }

    @Autowired
    private InstallationAndConfigurationService installationAndConfigurationService;

    @PostMapping({"/addInstallationAndConfiguration"})
    public InstallationAndConfiguration saveInstallationAndConfiguration(@RequestBody InstallationAndConfiguration installationAndConfiguration) {

        return installationAndConfigurationService.saveInstallationAndConfiguration(installationAndConfiguration);
    }

    @GetMapping("/installationAndConfigurations/{ptsRef}")
    public ResponseEntity<List<InstallationAndConfiguration>> getAllInstallationAndConfigurationByPtsRef(@PathVariable String ptsRef) {
        List<InstallationAndConfiguration> installationAndConfigurations = installationAndConfigurationService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(installationAndConfigurations);
    }

    @Autowired
    private SystemDevelopmentEnhancementService systemDevelopmentEnhancementService;

    @PostMapping({"/addSystemDevelopmentEnhancement"})
    public SystemDevelopmentEnhancement saveSystemDevelopmentEnhancement(@RequestBody SystemDevelopmentEnhancement systemDevelopmentEnhancement) {

        return systemDevelopmentEnhancementService.saveSystemDevelopmentEnhancement(systemDevelopmentEnhancement);
    }

    @GetMapping("/systemDevelopmentEnhancements/{ptsRef}")
    public ResponseEntity<List<SystemDevelopmentEnhancement>> getAllSystemDevelopmentEnhancementByPtsRef(@PathVariable String ptsRef) {
        List<SystemDevelopmentEnhancement> systemDevelopmentEnhancements = systemDevelopmentEnhancementService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(systemDevelopmentEnhancements);
    }

    @Autowired
    private SolutionTestingService solutionTestingService;

    @PostMapping({"/addSolutionTesting"})
    public SolutionTesting saveInformationGathering(@RequestBody SolutionTesting solutionTesting) {

        return solutionTestingService.saveSolutionTesting(solutionTesting);
    }

    @GetMapping("/solutionTestings/{ptsRef}")
    public ResponseEntity<List<SolutionTesting>> getAllSolutionTestingByPtsRef(@PathVariable String ptsRef) {
        List<SolutionTesting> solutionTestings = solutionTestingService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(solutionTestings);
    }

    @Autowired
    private ProgressToDateService progressToDateService;

    @PostMapping({"/addProgressToDate"})
    public ProgressToDate saveInformationGathering(@RequestBody ProgressToDate progressToDate) {

        return progressToDateService.saveProgressToDate(progressToDate);
    }

    @GetMapping("/progressToDates/{ptsRef}")
    public ResponseEntity<List<ProgressToDate>> getAllProgressToDateByPtsRef(@PathVariable String ptsRef) {
        List<ProgressToDate> progressToDates = progressToDateService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(progressToDates);
    }

    @Autowired
    private ChallengesService challengesService;

    @PostMapping({"/addChallenges"})
    public Challenges saveChallenges(@RequestBody Challenges challenges) {

        return challengesService.saveChallenges(challenges);
    }

    @GetMapping("/challenges/{ptsRef}")
    public ResponseEntity<List<Challenges>> getAllChallengesByPtsRef(@PathVariable String ptsRef) {
        List<Challenges> challenges = challengesService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(challenges);
    }

    @Autowired
    private CloseOutHandOverReportService closeOutHandOverReportService;

    @PostMapping({"/addCloseOut"})
    public CloseOutHandOverReport addCloseOut(@RequestBody CloseOutHandOverReport closeOutHandOverReport) {

        return closeOutHandOverReportService.saveCloseOut(closeOutHandOverReport);
    }

    @GetMapping("/closeOutHandOverReports/{ptsRef}")
    public ResponseEntity<List<CloseOutHandOverReport>> getAllCloseOutHandOverReportByPtsRef(@PathVariable String ptsRef) {
        List<CloseOutHandOverReport> closeOutHandOverReports = closeOutHandOverReportService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(closeOutHandOverReports);
    }


}
